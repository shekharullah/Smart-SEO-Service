package providers;

import com.feth.play.module.pa.providers.password.DefaultUsernamePasswordAuthUser;
/**
 *  
         User.java is written for User Entity
 *
 * @version      
         1.0 1st June 2015  * @author          
         Shekhar Ullah  */
public class MyLoginUsernamePasswordAuthUser extends
		DefaultUsernamePasswordAuthUser {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The session timeout in seconds
	 * Defaults to two weeks
	 */
	final static long SESSION_TIMEOUT = 24 * 14 * 3600;
	private long expiration;

	/**
	 * For logging the user in automatically
	 * 
	 * @param email
	 */
	public MyLoginUsernamePasswordAuthUser(final String email) {
		this(null, email);
	}

	public MyLoginUsernamePasswordAuthUser(final String clearPassword,
			final String email) {
		super(clearPassword, email);

		expiration = System.currentTimeMillis() + 1000 * SESSION_TIMEOUT;
	}

	@Override
	public long expires() {
		return expiration;
	}

}
