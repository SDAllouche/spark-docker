package ma.sdia;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        SparkConf conf=new SparkConf().setAppName("Spark Docker").setMaster("spark://spark-master:7077");
        JavaSparkContext sc=new JavaSparkContext(conf);
        JavaRDD<Integer> rdd1=sc.parallelize(Arrays.asList(12,6,8,9,10));
        rdd1.collect().forEach(System.out::println);
    }
}