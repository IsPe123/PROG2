ElementoAlquilable (Abs)


Elemento Simple {
    Herramienta de trabajo
        - (int) valor
        - (date) Fecha de compra
        - (int) id
        - (String) descripcion

    Muebles de oficina
        - (int) valor
        - (date) Fecha de compra
        - (int) id
        - (String) descripcion

    Inmuebles
        - (int) valor
        - (date) Fecha de compra
        - (int) id
        - (String) descripcion
}


Combos armados
    - (int) id
    - (ArrayList) ElementoAlquilable
    + [int] getValor
    + [date] getFechaDeCompra


Elemento deprecated
    - (int) id
    - (Elemento Alquilable) elem
    - (int) pocentaje                    //private static int contador = 0; 
    + [int] getValor


Empresa
    - (Elemento Alquilables)
    + [Elemento Alquilable (CriterioAbs)] listar
    

CriterioAbs
...




CalcularAlquiler()
    -Costo Fijo
    -Se cobra un porcentaje de su valor
    -PorcentajeExtra
