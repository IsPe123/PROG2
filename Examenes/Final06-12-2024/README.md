

Miembro
   -NombreClave
   -MetalesFavoritos
   -Altura
   -HabilidadPrincipal



TrajeABS {
   -Nombre
   


    Traje
       -Nombre
       -Talle
       -ArrayList<Metales>
       -Planeta
       +Buscar(Requisito rr)
       +CopiaModificada(Modificacion mm)


    EquipoTactico
       -ArrayList<TrajeABS>
       -Nombre 
       +Obtener metales
       +Calcular talle
       +Buscar(Requisito rr)
       +CopiaModificada(Modificacion mm)


    EquipoTacticoEspecial
       -ArrayList<TrajeABS>
       -Nombre 
       +Obtener metales
       +Calcular talle
       +Buscar(Requisito rr)
       +CopiaModificada(Modificacion mm)

}


Requisitos
   -AND
   -OR
   -NOT


Modificaciones
   -AND
   -AumentarTalle
   -CambiarPlaneta
   -AgregarMaterial