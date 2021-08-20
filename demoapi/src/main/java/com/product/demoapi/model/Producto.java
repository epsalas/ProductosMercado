package com.product.demoapi.model;

import java.util.Date;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {
    private String Id;
        private String nombre;
        private String descripcion;
        private String marca;
        
        private Date fecha;
    
}
