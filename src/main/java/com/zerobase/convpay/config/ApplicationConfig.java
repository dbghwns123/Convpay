package com.zerobase.convpay.config;

import com.zerobase.convpay.ConvpayApplication;
import com.zerobase.convpay.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@ComponentScan(basePackages = "com.zerobase.convpay")
//@ComponentScan(basePackageClasses = ConvpayApplication.class)
public class ApplicationConfig {

//    @Bean
//    public ConveniencePayService conveniencePayService() {
//        return new ConveniencePayService(
//                new HashSet<>(Arrays.asList(moneyAdapter(), cardAdapter())), discountByConvenience());
//    }
//
//    @Bean
//    public static CardAdapter cardAdapter() {
//        return new CardAdapter();
//    }
//
//    @Bean
//    public static MoneyAdapter moneyAdapter() {
//        return new MoneyAdapter();
//    }
//
//    @Bean
//    public static DiscountByConvenience discountByConvenience() {
//        return new DiscountByConvenience();
//    }

//    @Bean
//    public ConveniencePayService conveniencePayServiceDiscountPayMethod() {
//        return new ConveniencePayService(
//                new HashSet<>(Arrays.asList(new MoneyAdapter(), new CardAdapter())), new DiscountByPayMethod());
//    }

}
