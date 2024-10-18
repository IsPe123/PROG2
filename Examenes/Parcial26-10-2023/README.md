PiezaAbs
    -String nombre
    -String descripcion

    +getNombre()
    +getDesccripcion()
    +getCantidadPLA()     Abstract
    +getColores()         Abstract
    +getTiempo()          Abstract
    +buscar(Condicion cc) Abstract
    +contarSimples()      Abstract



PiezaSimple ext PiezaAbs
    -int cantidadPLA
    -String color
    -int tiempo
    
    +getCantidadPLA()
    +getColor()
    +getTiempo()
    +getColores()         @Override
    +buscar(Condicion cc) @Override
    +contarSimples()      @Override



PiezaCompuesta ext PiezaAbs
    -ArrayList<PiezaAbs> piezas
    -int tiempoExtra = 0;
    -int cantidadExtra = 0;

    +getCantidadPLA()     @Override
    +getColores()         @Override
    +getTiempo()          @Override
    +buscar(Condicion cc) @Override
    +contarSimples()      @Override


CondicionAbs
    +cumple(PiezaAbs pp)

CondicionColor ext CondicionAbs
    +cumple(PiezaAbs pp)

CondicionCantidadPLA ext CondicionAbs
    +cumple(PiezaAbs pp)

CondicionTiempo ext CondicionAbs
    +cumple(PiezaAbs pp)


and
or
not