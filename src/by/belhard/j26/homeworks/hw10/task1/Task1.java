package by.belhard.j26.homeworks.hw10.task1;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {

	public static void main(String[] args) {

		try {
			BufferedReader rdr = new BufferedReader(new FileReader("resources/hw10/task1.in"));

			String line = rdr.readLine();
			rdr.close();
			String[] splitted = line.split(" ");

			String collect = Arrays.stream(splitted).mapToInt(Integer::parseInt).map(i -> (int)Math.pow(i, 3)).mapToObj(String::valueOf).collect(Collectors.joining(" "));

			BufferedWriter wrt = new BufferedWriter(new FileWriter("resources/hw10/task1.out"));
			wrt.write(collect);
			wrt.flush();
			wrt.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
