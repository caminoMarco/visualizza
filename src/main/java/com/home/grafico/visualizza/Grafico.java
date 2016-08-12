package com.home.grafico.visualizza;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Grafico {
	
	
     public static void main( String[] args ) 
     { 
         System.out.println( "Prova di jfreechart incluso con maven 1" );  
          
         DefaultPieDataset objDataset = new DefaultPieDataset(); 
         objDataset.setValue("Apple",29); 
         objDataset.setValue("HTC",15); 
         objDataset.setValue("Samsung",24); 
         objDataset.setValue("LG",7); 
         objDataset.setValue("Motorola",10); 
          
         JFreeChart objChart = ChartFactory.createPieChart ( 
         	    "Demo Pie Chart",   //Chart title 
         	    objDataset,         //Chart Data  
         	    true,               // include legend? 
         	    true,               // include tooltips? 
         	    false               // include URLs? 
         	    ); 
          
         ChartFrame frame = new ChartFrame("Demo", objChart); 
         frame.pack(); 
         frame.setVisible(true); 
         System.out.println( "Prova di jfreechart incluso con maven 2" ); 
         System.out.println( "master 2.1" );
         System.out.println( "master 2.2" );
         System.out.println( "master 2.3" );
         System.out.println( "master 2.4" );
         System.out.println( "master 2.5" );
 
     } 


}
