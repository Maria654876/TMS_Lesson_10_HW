package com.lesson10.tms.task3;

public final class Task3 {
    String name;
    String lastName;

    public Task3(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Task3{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public void out(){
        System.out.println("Do");
    }

    public static void main(String[] args) {
        Task3 nd=new Task3("Lip","Fip");
        nd.out();
    }
}
