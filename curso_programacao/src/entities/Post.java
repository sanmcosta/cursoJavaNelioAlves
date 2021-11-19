package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private final String quebraLinha = "\n";

	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	public Post() {

	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComments(Comment comment) {
		comments.add(comment);
	}

	public void removeComments(Comment comment) {
		comments.remove(comment);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		if (sb.length() != 0)
			sb.append(quebraLinha);
		sb.append(title + quebraLinha);
		sb.append(likes + " Likes - ");
		sb.append(sdf.format(moment) + quebraLinha);
		sb.append(content + quebraLinha);
		sb.append("Comments:" + quebraLinha);
		for (Comment c : comments) {
			sb.append(c.getText() + quebraLinha);
		}

		return sb.toString();
	}
}
