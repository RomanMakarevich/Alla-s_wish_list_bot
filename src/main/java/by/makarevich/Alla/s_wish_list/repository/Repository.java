package by.makarevich.Alla.s_wish_list.repository;

import by.makarevich.Alla.s_wish_list.dto.RequestDTO;

import java.io.*;
import java.util.ArrayList;

public class Repository {
    public void save(String text) {
        try (FileOutputStream fos = new FileOutputStream("list.txt",true);
             PrintStream ps = new PrintStream(fos)) {

            ps.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void save(ArrayList<String> list) {
        try (FileOutputStream fos = new FileOutputStream("list.txt");
             PrintStream ps = new PrintStream(fos)) {
            for (int i = 0; i < list.size(); i++) {
                ps.println(list.get(i));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> get(){
        ArrayList<String> list = new ArrayList();

        try (FileReader fr = new FileReader("list.txt");
             BufferedReader br = new BufferedReader(fr)){

            String input;
            while ((input = br.readLine()) != null){
                list.add(input);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
