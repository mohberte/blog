package org.mohsoft.blog.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mohsoft.blog.model.Comment;
import org.mohsoft.blog.model.Post;
import org.mohsoft.blog.model.Profile;

public class Database {

	private static Map<Integer, Post> posts = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	private static Map<Integer, Comment> comments = new HashMap<>();

	
	public Database()
	{}
	static{


		comments.put(0, new Comment(0,"Good"));
		comments.put(1, new Comment(1,"I like it ! "));
		comments.put(2, new Comment(2,"Can't wait for your next blog post ")); 
		comments.put(3, new Comment(3,"I wish I could do that"));
		comments.put(4, new Comment(4,"Thats so inspiring !"));
		comments.put(5, new Comment(5,"Thanks for sharing with us"));
		comments.put(6, new Comment(6,"okay"));
		comments.put(7, new Comment(7,"That's unfortunate"));
		comments.put(8, new Comment(8,"I enjoy snowboarding too :)"));
		
		List<Comment> c = new ArrayList<Comment>(comments.values());
		
		posts.put(0, new Post(0, "i love football because it brings families together and it shows the brotherhood between all of the men out there."
				+ "i love going to the game and watching them play each game.\r\n"
				+ "It is so fun to see all of the guys in their uniforms and hear them yelling.\r\n"
				+ "the fans are very enthusiastic.\r\n"
				+ "Its a lot of fun", "Carlos", Arrays.asList(c.get(0),c.get(1))));
		
		posts.put(1, new Post(1, "i started teaching bass this fall, and i love it.\r\n"
				+ "The band i work for is called \"Interlocal Brass.\"\r\n"
				+ "The name is pretty much self explanatory.\r\n"
				+ "There are about 21 to 25 people in our band, and it is a ton of fun.\r\n"
				+ "We practice for about 3 hours a week, and then play the games each week.\r\n"
				+ "When i started, there were about three other people.i like that i can teach the little ones, and they are so cute and funny.\r\n"
				+ "i love doing it!","Carlos",Arrays.asList(c.get(2),c.get(3))));
		
		posts.put(2, new Post(2, "Three years ago, I got married in December.\r\n"
				+ "I am so glad i did it that way, and i am glad that i do not regret my choice.\r\n"
				+ "I was able to spend most of the month of December with my family before they went back to Bama.\r\n"
				+ "During this month, we had some time to celebrate.\r\n"
				+ "We had my Nanny's party, my parents anniversary party, and my brothers birthday party.\r\n"
				+ "It was a fun month.\r\n"
				+ "The last weekend of December, i drove down to Bama to see my family.\r\n"
				+ "i flew down on the 27th, and flew back on the 29th.\r\n"
				+ "it was a fun trip.\r\n"
				+ "i got to see all of my extended family.\r\n"
				+ "I love going down to visit them.\r\n"
				+ "it is so much fun.\r\n"
				+ "I miss them so much.","John",Arrays.asList(c.get(4),c.get(5),c.get(6))));
		
		posts.put(3, new Post(3, "i like sports, \r\n"
				+ "most of the time.\r\n"			
				+ "so it wasn't really a surprise that i went to a kids' march in Portland yesterday.\r\n"				
				+ "but then i came home and i was surprised.\r\n"				
				+ "because there is a big layer of thick snow on the ground, with more forecasted, and now i can't do what i want to do.\r\n"				
				+ "i like to go snowboarding.\r\n"				
				+ "i'm bad at it, but i like doing it.\r\n"
				+ "but the day after a snow day, i can't go.\r\n"
				+ "(that's just a reminder that i've made myself angry in this post.\r\n"
				+ "so yeah.)\r\n"
				+ "then there's the coat, and the gloves, and the scarves, and the tights, and the boots, and the hats and the heavy boots.\r\n"
				+ "and the hats and boots that don't fit right anymore and the hats and boots that are falling apart and i think i can't wear them anymore"
				+ ".","Alex",Arrays.asList(c.get(7),c.get(8))));
		
		List<Post> p = new ArrayList<Post>(posts.values());
		
		profiles.put("Carlos", new Profile(1L, "Carlos", Arrays.asList(p.get(0),p.get(1))));
		profiles.put("John", new Profile(2L, "John",Arrays.asList(p.get(2))));
		profiles.put("Alex", new Profile(3L, "Alex",Arrays.asList(p.get(3))));
		
		
		
	}
	public static Map<Integer, Post> getPosts() {
		return posts;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

}