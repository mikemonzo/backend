package com.example.backend.controller;

import com.example.backend.model.Price;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    /*
    - Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
        2020-06-14 10:00:00 35455 1 */

    @Test
    void test_1_queryPrice() throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time1 = "2020-06-14 10:00:00";
        LocalDateTime localTimeObj = LocalDateTime.parse(time1, formatter);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("implementationDate", time1);
        map.add("idProduct", "35455");
        map.add("idBrand", "1");



        var findByPar = mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .params(map)
                )
                .andExpect(status().isOk())
                .andReturn();

        List<Price> myObjects = objectMapper.readValue(
                findByPar.getResponse().getContentAsString(),
                objectMapper.getTypeFactory().constructCollectionType(List.class, Price.class));
        for (Price myObject : myObjects) {
            assert Integer.toString(myObject.getIdProduct()).equalsIgnoreCase("35455");
            assert Integer.toString(myObject.getIdBrand()).equalsIgnoreCase("1");
            assert myObject.getStartDate().isBefore(localTimeObj);
            assert myObject.getEndDate().isAfter(localTimeObj);

        }
    }
    /*- Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
    2020-06-14 16:00:00 35455 1*/
    @Test
    void test_2_queryPrice() throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time2 = "2020-06-14 16:00:00";
        LocalDateTime localTimeObj = LocalDateTime.parse(time2, formatter);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("implementationDate", time2);
        map.add("idProduct", "35455");
        map.add("idBrand", "1");

        var findByPar = mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .params(map)
                )
                .andExpect(status().isOk())
                .andReturn();

        List<Price> myObjects = objectMapper.readValue(
                findByPar.getResponse().getContentAsString(),
                objectMapper.getTypeFactory().constructCollectionType(List.class, Price.class));
        for (Price myObject : myObjects) {
            assert Integer.toString(myObject.getIdProduct()).equalsIgnoreCase("35455");
            assert Integer.toString(myObject.getIdBrand()).equalsIgnoreCase("1");
            assert myObject.getStartDate().isBefore(localTimeObj);
            assert myObject.getEndDate().isAfter(localTimeObj);

        }
    }
    /*- Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
    2020-06-14 21:00:00 35455 1
     */
    @Test
    void test_3_queryPrice() throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time3 = "2020-06-14 16:00:00";
        LocalDateTime localTimeObj = LocalDateTime.parse(time3, formatter);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("implementationDate", time3);
        map.add("idProduct", "35455");
        map.add("idBrand", "1");

        var findByPar = mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .params(map)
                )
                .andExpect(status().isOk())
                .andReturn();

        List<Price> myObjects = objectMapper.readValue(
                findByPar.getResponse().getContentAsString(),
                objectMapper.getTypeFactory().constructCollectionType(List.class, Price.class));
        for (Price myObject : myObjects) {
            assert Integer.toString(myObject.getIdProduct()).equalsIgnoreCase("35455");
            assert Integer.toString(myObject.getIdBrand()).equalsIgnoreCase("1");
            assert myObject.getStartDate().isBefore(localTimeObj);
            assert myObject.getEndDate().isAfter(localTimeObj);

        }
    }
    /*- Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
    2020-06-15 10:00:00 35455 1*/
    @Test
    void test_4_queryPrice() throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time1 = "2020-06-15 10:00:00";
        LocalDateTime localTimeObj = LocalDateTime.parse(time1, formatter);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("implementationDate", time1);
        map.add("idProduct", "35455");
        map.add("idBrand", "1");

        var findByPar = mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .params(map)
                )
                .andExpect(status().isOk())
                .andReturn();

        List<Price> myObjects = objectMapper.readValue(
                findByPar.getResponse().getContentAsString(),
                objectMapper.getTypeFactory().constructCollectionType(List.class, Price.class));
        for (Price myObject : myObjects) {
            assert Integer.toString(myObject.getIdProduct()).equalsIgnoreCase("35455");
            assert Integer.toString(myObject.getIdBrand()).equalsIgnoreCase("1");
            assert myObject.getStartDate().isBefore(localTimeObj);
            assert myObject.getEndDate().isAfter(localTimeObj);

        }
    }
    /*- Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
    2020-06-16 21:00:00 35455 1
     */
    @Test
    void test_5_queryPrice() throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time5 = "2020-06-16 21:00:00";
        LocalDateTime localTimeObj = LocalDateTime.parse(time5, formatter);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("implementationDate", time5);
        map.add("idProduct", "35455");
        map.add("idBrand", "1");

        var findByPar = mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .params(map)
                )
                .andExpect(status().isOk())
                .andReturn();

        List<Price> myObjects = objectMapper.readValue(
                findByPar.getResponse().getContentAsString(),
                objectMapper.getTypeFactory().constructCollectionType(List.class, Price.class));
        for (Price myObject : myObjects) {
            assert Integer.toString(myObject.getIdProduct()).equalsIgnoreCase("35455");
            assert Integer.toString(myObject.getIdBrand()).equalsIgnoreCase("1");
            assert myObject.getStartDate().isBefore(localTimeObj);
            assert myObject.getEndDate().isAfter(localTimeObj);

        }
    }
}