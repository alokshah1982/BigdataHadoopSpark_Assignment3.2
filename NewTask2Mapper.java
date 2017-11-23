package mapreduce.demo.newtask2;

import java.io.IOException;


import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 

public class NewTask2Mapper extends Mapper<LongWritable, Text, Text, Text> {
	public void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException {
		String[] lineArray = value.toString().split("\\|");
		
		Text compnm = new Text(lineArray[0]);
		Text pronm = new Text(lineArray[1]);
		String cnm = compnm.toString();
		String pnm =pronm.toString();
	
		if ( !((cnm.equals("NA")) || (pnm.equals("NA")) ))
		{
			context.write(new Text(""), value);
		}
		
	}
}