package fh.lab2.videoportal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Video {
	
	@Id
	private String id;
	private String video;
	private String description;
	
	public Video() {
	}

	public Video(String id, String video, String description) {
		super();
		this.id = id;
		this.video = video;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
