Fotografia extends elemFotografia
    id               int
    titulo           String
    peso             int
    personas         ArrayList<String>  VACIA
    fechaDeCreacion  LocalDate


Album extends elemFotografia
    titulo           String 
    FechaDeCreacion  LocalDate
    elem         ArrayList<elemFotografia>  VACIA


