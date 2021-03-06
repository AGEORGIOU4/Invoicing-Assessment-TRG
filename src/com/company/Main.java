/**
 * Andreas Georgiou
 **/

package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // Customer
        Customer myCustomer = new Customer("Andreas", "George", "Georgiou", "Arch. Makariou 111",
                "99123456");

        // Account
        Account myAccount = new Account(1111, myCustomer);

        // Services
        Service myService = new Service("service", "description", 50);
        Vector<Service> listOfServices = new Vector<>();
        listOfServices.add(myService);
        myAccount.setServices(listOfServices);

        // Items
        Item myItem = new Item(myService, 2);
        Vector<Item> listOfItems = new Vector<>();
        listOfItems.add(myItem);

        // Invoices
        Invoice myInvoice = new Invoice(1, System.currentTimeMillis(), listOfItems);

        Vector<Invoice> listOfInvoices = new Vector<>();
        listOfInvoices.add(myInvoice);
        myAccount.setInvoices(listOfInvoices);

        myAccount.generateCustomerInvoice();

        //===================================================================================//

        // Lists
        Vector<Service> listOfServices1 = new Vector<>();
        Vector<Item> listOfItems1 = new Vector<>();
        Vector<Item> listOfItems2 = new Vector<>();
        Vector<Invoice> listOfInvoices1 = new Vector<>();

        // Services
        Service myService1 = new Service("service1", "description1", 5);
        Service myService2 = new Service("service2", "description2", 10);
        Service myService3 = new Service("service3", "description3", 20);
        Service myService4 = new Service("service4", "description4", 40);
        Service myService5 = new Service("service5", "description5", 80);
        Service myService6 = new Service("service6", "description6", 160);

        // List of Services
        listOfServices1.add(myService1);
        listOfServices1.add(myService2);
        listOfServices1.add(myService3);
        listOfServices1.add(myService4);
        listOfServices1.add(myService5);
        listOfServices1.add(myService6);

        // Items
        Item myItem1 = new Item(myService1, 2);
        Item myItem2 = new Item(myService2, 1);
        Item myItem3 = new Item(myService3, 4);
        Item myItem4 = new Item(myService4, 1);
        Item myItem5 = new Item(myService5, 2);
        Item myItem6 = new Item(myService6, 1);

        // List of Items
        listOfItems1.add(myItem1);
        listOfItems1.add(myItem2);
        listOfItems1.add(myItem3);
        listOfItems2.add(myItem4);
        listOfItems2.add(myItem5);
        listOfItems2.add(myItem6);

        // Invoices
        Invoice myInvoice1 = new Invoice(1, System.currentTimeMillis(), listOfItems1);
        Invoice myInvoice2 = new Invoice(2, System.currentTimeMillis(), listOfItems2);
        Invoice myInvoice3 = new Invoice(3, System.currentTimeMillis(), listOfItems1);

        // List of Invoices
        listOfInvoices1.add(myInvoice1);
        listOfInvoices1.add(myInvoice2);

        // Account
        Customer customer = new Customer("Pavlos", "George", "Georgiou", "Riga Fereou",
                "99654321");
        Account account = new Account(2222, customer, listOfServices1, listOfInvoices1);

        account.generateCustomerInvoice();

        // Add new invoice
        Vector<Invoice> listOfInvoices2 = new Vector<>();
        listOfInvoices2.add(myInvoice3);

        // Recalculate balance with the new invoice
        account.calculateBalance(listOfInvoices2);

        account.generateCustomerInvoice();

        // Clear account balance
        account.clearBalance();

        account.generateCustomerInvoice();

        Customer testCustomer = new Customer("Andreas", "Georgiou", "Georgiou", "Archiepiskopou Makariou C' 111",
                "+35799131666");

        Account testAccount = new Account(177, testCustomer);

        // Services
        Service testService1 = new Service("Test Service 1", "Simple Service 1", 12);
        Service testService2 = new Service("Test Service 2", "Simple Service 2", 50);

        // Populate a vector of services
        Vector<Service> testListOfServices = new Vector<>();
        testListOfServices.add(testService1);
        testListOfServices.add(testService2);

        // Items
        Item testItem1 = new Item(testService1, 2);
        Item testItem2 = new Item(testService2, 3);

        // Populate a vector of items
        Vector<Item> testListOfItems = new Vector<>();
        testListOfItems.add(testItem1);
        testListOfItems.add(testItem2);

        // Invoices
        Invoice testInvoice = new Invoice(998, System.currentTimeMillis(), testListOfItems);

        Vector<Invoice> testListOfInvoices = new Vector<>();
        testListOfInvoices.add(testInvoice);

        // Add services and invoices on the account
        testAccount.setServices(testListOfServices);
        testAccount.setInvoices(testListOfInvoices);

        testAccount.generateCustomerInvoice();


        Service testService3 = new Service("Test Service 3", "Simple Service 3", 64.50f);
        testListOfServices.add(testService3);

        Item testItem3 = new Item(testService3, 3);
        testListOfItems.add(testItem3);

        Invoice testInvoice2 = new Invoice(999, System.currentTimeMillis(), testListOfItems);
        testListOfInvoices.add(testInvoice2);
        testAccount.setInvoices(testListOfInvoices);

        testAccount.generateCustomerInvoice();
    }
}
