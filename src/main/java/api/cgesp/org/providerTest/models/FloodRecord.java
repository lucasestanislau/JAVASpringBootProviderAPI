/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.cgesp.org.providerTest.models;

import api.cgesp.org.providerTest.repository.RecordRepository;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author lucas
 */
public class FloodRecord /*implements Comparable<FloodRecord>*/ {



    
    /*
    private int id;
    private String zone, neighborhood, street, startDT, endDT, direction,
            reference, status;
    public static List<FloodRecord> list = new ArrayList<>();

    static {
        floodRecordRepository();
    }

    public FloodRecord() {

    }

    private static void floodRecordRepository() {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("floodsWithIdTest.csv")));
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] a = line.split("\t");
                FloodRecord o = new FloodRecord();
                o.setId(Integer.parseInt(a[0]));
                o.setZone(a[1]);
                o.setNeighborhood(a[2]);
                o.setStreet(a[3]);
                o.setStartDT(a[4]);
                o.setEndDT(a[5]);
                o.setDirection(a[6]);
                o.setReference(a[7]);
                o.setStatus(a[8]);

                list.add(o);
            }
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void addFlood(FloodRecord f) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("floodsWithIdTest.csv", true));
            BufferedReader reader = new BufferedReader(new FileReader("floodsWithIdTest.csv"));

            Collections.sort(list);
            if (list.contains(f)) {
                f.setId(list.get(list.size() - 1).getId() + 1);
            }

            String line = f.getId() + "\t" + f.getZone() + "\t"
                    + f.getNeighborhood() + "\t"
                    + f.getStreet() + "\t"
                    + f.getStartDT() + "\t"
                    + f.getEndDT() + "\t"
                    + f.getDirection() + "\t"
                    + f.getReference() + "\t"
                    + f.getStatus();
            writer.append(line);
            writer.close();

            list.add(f);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void modificarArquivo() {
        Collections.sort(list);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("floodsWithIdTest.csv"));
            BufferedReader reader = new BufferedReader(new FileReader("floodsWithIdTest.csv"));
            writer.write("id\tZONA\tNeighborhood\tStreet\tStart date and time\tEnd date and time\tDirection\tReference\tStatus\n");
            reader.readLine();
            String line = null;
            for (FloodRecord f : FloodRecord.list) {
                writer.append(f.getId() + "\t" + f.getZone() + "\t" + f.getNeighborhood()
                        + "\t" + f.getStreet() + "\t" + f.getStartDT()
                        + "\t" + f.getEndDT() + "\t" + f.getDirection() + "\t" + f.getReference() + "\t" + f.getStatus() + "\n");
            }
            writer.flush();
            writer.close();
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStartDT() {
        return startDT;
    }

    public void setStartDT(String startDT) {
        this.startDT = startDT;
    }

    public String getEndDT() {
        return endDT;
    }

    public void setEndDT(String endDT) {
        this.endDT = endDT;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FloodRecord other = (FloodRecord) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(FloodRecord o) {
        //retorna negativo se oobjetothis for menor
        //zero se os obgejos forem iguais
        //positivo se o objetothis for maior
        if (o.getId() == this.id) {
            return 0;
        } else if (this.id > o.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
     */
}
