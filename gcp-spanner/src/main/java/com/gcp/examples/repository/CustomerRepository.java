package com.gcp.examples.repository;

import com.gcp.examples.model.Customer;
import com.google.cloud.spring.data.spanner.repository.SpannerRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends SpannerRepository<Customer, String> {
}
