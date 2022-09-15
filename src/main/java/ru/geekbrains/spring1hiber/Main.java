package ru.geekbrains.spring1hiber;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
            Product p = productDao.findById(1l);
            System.out.println(p);

            productDao.deleteById(1l);

            productDao.saveOrUpdate(new Product(2l, "ASDF", 555));

            List<Product> list =productDao.findAll();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
