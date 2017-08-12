import java.util.Scanner;

import javax.sound.midi.*;

public class MiniMiniMusicCMD {

	public static void main(String[] args) {
		
		System.out.print("Введіть ціле число: ");
		Scanner sc = new Scanner(System.in);	
		
		while (true){
			int i = 0;
		if(sc.hasNextInt()) { 
			 i = sc.nextInt();
			 if(i == -1){
					System.out.println("Ви ввели: " + i + ", отже виходимо!"); 
					break;
				}
				 if((i >= 0) && (i <= 127)) {
					MiniMiniMusicCMD mini = new MiniMiniMusicCMD();
					mini.play(i);
				 } else System.out.println("Введіть в межах від 0 до 127");
	//		 } else if(sc.hasNextLine())
	//			 		if(sc.equals("exit")) break;
		}	else if(!sc.hasNextInt()) 
			System.out.println("Ви ввели не ціле число, спробуйте ще раз!");
		}
			System.out.println("Дію програми завершено!");
}

	public void play(int note) {
		
		System.out.println("I am playing!!!");
		
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, note, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
		
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, note, 100);
			MidiEvent noteOff = new MidiEvent(b, 15);
			track.add(noteOff);
						
			player.setSequence(seq);
			player.start();
			System.out.println("Можете, ввести ще раз!");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
