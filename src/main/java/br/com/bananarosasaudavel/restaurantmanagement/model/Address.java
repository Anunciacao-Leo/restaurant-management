package br.com.bananarosasaudavel.restaurantmanagement.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Address(@JsonAlias("cep") String postalCode,
                      @JsonAlias("logradouro") String streetAddress,
                      @JsonAlias("bairro") String AddressLine2,
                      @JsonAlias("localidade") String City,
                      @JsonAlias("uf") String State
                      ){
}
