package fh.lab2.videoportal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @RequestMapping("/home")
    public String serviceTest(){
        return "Das Service funktioniert!";
    }

	@Autowired
	private VideoService videoService;

	@RequestMapping("/videos")
	public List<Video> getallVideos() {
		return videoService.getallVideos();
	}


	@RequestMapping("/videos/{id}")
	public Optional<Video> getVideo(@PathVariable String id) {
		return videoService.getVideo(id);
	}

	//@PostMapping("/videos")
	@RequestMapping(method=RequestMethod.POST, value="/videos")
	public String addVideo(@RequestBody Video video) {
		videoService.addVideo(video);
		String response = "{\"success\": true, \"message\": Video has been added successfully.}";
		return response;
	}
	
	//@RequestMapping(method=RequestMethod.PUT, value="/videos/{id}")
	@PutMapping("/videos/{id}")
	public String updateVideo(@RequestBody Video video, @PathVariable String id) {
		videoService.updateVideo(id, video);
		String response = "{\"success\": true, \"message\": Video has been updated successfully.}";
		return response;
	}


	//@RequestMapping(method=RequestMethod.DELETE, value="/videos/{id}")
	@DeleteMapping("/videos/{id}")
	public String deleteVideo(@PathVariable String id) {
		videoService.deleteVideo(id);
		String response = "{\"success\": true, \"message\": Video has been deleted successfully.}";
		return response;
	}


}
