package br.com.bananarosasaudavel.restaurantmanagement.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AddressData(@JsonAlias("cep") String postalCode,
                          @JsonAlias("logradouro") String streetAddress,
                          @JsonAlias("bairro") String addressLine2,
                          @JsonAlias("localidade") String city,
                          @JsonAlias("uf") String state) {
    @Override
    public String toString() {
        return "CEP:" + postalCode +
                "\nLogradouro: " + streetAddress +
                "\nBairro: " + addressLine2 +
                "\nCidade: " + city +
                "\nUF: " + state;
    }
}
