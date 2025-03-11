SDA:

ElemABS
   +CalcularTamaño
   +Buscar(Criterio cc)



Archivos
   -String nombre
   -int tamaño
   -LocalDate fechaDeCreacion
   -String creador

   +CalcularTamaño
   +Buscar(Criterio cc)



Directorios
   -ArrayList<ElemABS> elementos
   -String nombre
   -LocalDate fechaDeCreacion
   
   +CalcularTamaño
   +AddElemento
   +Buscar(Criterio cc)



Archivos comprimidos
   -ArrayList<ElemABS> elementos
   -int porcentajeCompresion

   +CalcularTamaño
   +AddElemento
   +Buscar(Criterio cc)



CriterioABS
...


Biblioteca

Recurso
   -String nombre
   -int tamaño
   -LocalDate fechaDeCreacion
   -String tematica



GrupoDidactico
   -ArrayList<ElemABS> elementos
   -String nombre
   -LocalDate fechaDeCreacion
   
   +CalcularTamaño



ElemCompuestoA: Directorio
ElemCompuestoB: Comprimido
ElemCompuestoC: Grupo didactico