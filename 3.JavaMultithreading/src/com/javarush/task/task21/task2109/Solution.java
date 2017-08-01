package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        public int i;
        public int j;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            A a = (A) o;

            if (i != a.i) return false;
            return j == a.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }

        public A clone () throws CloneNotSupportedException {

            A cloneA = new A(this.getI(),this.getJ());
            return cloneA;
        }

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    private static class B extends A {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            B b = (B) o;

            return name != null ? name.equals(b.name) : b.name == null;

        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        private String name;

        public B clone() throws CloneNotSupportedException {

            throw new CloneNotSupportedException();
        }

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B {

        public C clone () {

            C cloneC= new C (this.i, this.j, getName());
            return cloneC;

        }

        public C(int i, int j, String name) {
            super(i, j, name);


        }
    }

    public static void main(String[] args) {

    }
}
