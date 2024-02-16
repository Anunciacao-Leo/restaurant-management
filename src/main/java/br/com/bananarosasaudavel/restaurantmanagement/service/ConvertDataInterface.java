package br.com.bananarosasaudavel.restaurantmanagement.service;

public interface ConvertDataInterface {
    <T> T getData(String json, Class<T> tClass);
}
