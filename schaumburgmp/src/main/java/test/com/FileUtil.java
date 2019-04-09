/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author ShraddhaGanesh
 */
public class FileUtil {
 Contact cont;
 
 private void loadFile()
 {try
 {
     FileReader fr = new FileReader("c:\\data\\datasch.txt");
     BufferedReader br = new BufferedReader(fr);
     String line = br.readLine();
     StringTokenizer st = new StringTokenizer(line, "=");
     st.nextToken();
     String fname = (String)st.nextToken();
     
     line = br.readLine();
     st = new StringTokenizer(line, "=");
     st.nextToken();
     String lname = (String)st.nextToken();
     
     line = br.readLine();
     st = new StringTokenizer(line, "=");
     st.nextToken();
     String phnum = (String)st.nextToken();
     
     line = br.readLine();
     st = new StringTokenizer(line, "=");
     st.nextToken();
     String email = (String)st.nextToken();
     
     line = br.readLine();
     st = new StringTokenizer(line, "=");
     st.nextToken();
     String comment = (String)st.nextToken();
     
     //populate value
    cont = new Contact();
    cont.setFname(fname);
    cont.setLname(lname);
    cont.setPhnum(phnum);
    cont.setEmail(email);
    cont.setComment(comment); 
     
 }
 catch (Exception e){
 e.printStackTrace(System.out);
 }
 }
    
  public FileUtil() {
    loadFile();
    }

    

    
    public String getFname()
    {
    return cont.getFname();
    }
    
    public String getLname()
    {
    return cont.getLname();
    }
    
    public String getPhnum()
    {
    return cont.getPhnum();
    }
    
    public String getEmail()
    {
    return cont.getEmail();
    }
 
    public String getComment()
    {
    return cont.getComment();
    }
    
    
}
