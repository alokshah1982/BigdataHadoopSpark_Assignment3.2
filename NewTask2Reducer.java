package mapreduce.demo.newtask2;

import java.io.IOException;


import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class NewTask2Reducer extends Reducer<Text, Text, Text, Text>
{	
	public void reduce(Text key, Iterable<Text> values,Context context) throws IOException, InterruptedException
	{
		//StringBuilder str = new StringBuilder();
		for (Text value : values) {
			//str.append(value.toString());
			//str.append("\n");
			context.write(key, value);
		}

		
	}
}