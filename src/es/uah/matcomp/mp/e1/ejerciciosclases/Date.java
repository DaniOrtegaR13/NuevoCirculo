package es.uah.matcomp.mp.e1.ejerciciosclases;
import java.text.DecimalFormat;

// 1.7

public class Date {


    public static void main(String[] args) {



        int number = 7;
        DecimalFormat df = new DecimalFormat("000");
        String formattedNumber = df.format(number);
        System.out.println(formattedNumber); // Imprime "007"
    }
        private int day;
        //int day = [1,31];
        private int month;
        //int month = [1,12];
        private int year;
        //int year = [1900,1999];

    public Date( int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public int getDay () {
            return day;
        }
        public int getMonth () {
            return month;
        }
        public int getYear () {
            return year;
        }

        public void setDay ( int day){
            this.day = day;
        }
        public void setMonth ( int month){
            this.month = month;
        }
        public void setYear ( int year){
            this.year = year;
        }

        public void setDate ( int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;

        }


        public String toString () {



            DecimalFormat dfd = new DecimalFormat("00");
            String formattedDay = dfd.format(day);

            DecimalFormat dfm = new DecimalFormat("00");
            String formattedMonth = dfm.format(month);

            return  formattedDay + "/ " + formattedMonth + "/" + year;



        }


        }




