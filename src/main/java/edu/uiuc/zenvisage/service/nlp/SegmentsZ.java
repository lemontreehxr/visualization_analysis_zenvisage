package edu.uiuc.zenvisage.service.nlp;

import java.util.ArrayList;
import java.util.List;

public class SegmentsZ {
	List<Segment> segments;
	String z;
	double[][] data;
	
	public SegmentsZ(List<Segment> segments , String z , double[][] data){
		this.data = data.clone();
		
		this.segments = new ArrayList<Segment>(segments);
		
//		for(Segment s : segments) {
//		    this.segments.add(Segment.clone(s, data));
//		}
		
		this.z = z; 
	}
}
