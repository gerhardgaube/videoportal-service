package fh.lab2.videoportal;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

	@Autowired
	private VideoRepository videoRepository;
	
	private List<Video> video = new ArrayList<>(Arrays.asList());


	public List<Video> getallVideos() {
		return (List<Video>) this.videoRepository.findAll();
	}

	public Optional<Video> getVideo(String id) {
		return this.videoRepository.findById(id);
	}

	public void addVideo(Video video) {
		this.videoRepository.save(video);
	}

	public void updateVideo(String id, Video video) {
		this.videoRepository.save(video);
	}

	public void deleteVideo(String id) {
		this.videoRepository.deleteById(id);
}


}