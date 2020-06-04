package com.axce1_.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try( DataOutputStream dout = new DataOutputStream(new FileOutputStream("test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println(d + " " +  b + " " + i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
