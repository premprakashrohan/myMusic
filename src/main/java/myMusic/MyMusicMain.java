package myMusic;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

public class MyMusicMain {

	public static void main(String[] args)
			throws IOException, CannotReadException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
		AudioFile f = AudioFileIO.read(new File("C:\\temp\\music\\test\\072.Achha To Hum Chalte Hain.mp3"));
		Tag tag = f.getTag();
		AudioHeader audH = f.getAudioHeader();
//		System.out.println(f.getAudioHeader().getTrackLength());
//		System.out.println(f.getAudioHeader().getSampleRateAsNumber());
//		System.out.println(tag.getFirst(FieldKey.ARTIST));
//		System.out.println(tag.getFirst(FieldKey.ALBUM));
//		System.out.println(tag.getFirst(FieldKey.TITLE));
//		System.out.println(tag.getFirst(FieldKey.COMMENT));
//		System.out.println(tag.getFirst(FieldKey.YEAR));
//		System.out.println(tag.getFirst(FieldKey.TRACK));
//		System.out.println(tag.getFirst(FieldKey.DISC_NO));
//		System.out.println(tag.getFirst(FieldKey.COMPOSER));
//		System.out.println(tag.getFirst(FieldKey.ARTIST_SORT));
//		for(FieldKey fk:FieldKey.values()) {
//			 System.out.println(fk.name()+"       "+tag.getFirst(fk));
//		}
		Iterator iterator = tag.getFields();
		while(iterator.hasNext())
		{
		  System.out.println(iterator.next());
		}	
	}

}
