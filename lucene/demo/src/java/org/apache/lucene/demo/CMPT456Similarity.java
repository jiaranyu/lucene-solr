package org.apache.lucene.demo;
import java.lang.Object;
import java.util.Arrays;
import org.apache.lucene.search.similarities.ClassicSimilarity;
import java.lang.Math;

//From Classic Similarity.java
public class CMPT456Similarity extends ClassicSimilarity {
    @Override
    public float tf(float freq) {
        System.out.println((float) (Math.sqrt(1 + freq)));
        return ((float) (Math.sqrt(1 + freq)));
    }


    @Override
    public float idf(long docFreq, long docCount) {
        System.out.println((float) (Math.log((docCount + 2) / (docFreq + 2)) + 1));
        return ((float) (Math.log((docCount + 2) / (docFreq + 2)) + 1));
    }
}