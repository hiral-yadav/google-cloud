package com.gcp.examples.model;

import com.google.cloud.spring.data.spanner.core.mapping.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "order")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private String id;
}
