/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.notification;

/**
 * The {@code interface} is implemented by classes that are used during a communication from
 * {@link INotificationEmitter} to {@link INotificationConsumer}. 
 * 
 * @author Anastasios Patrikis
 */
public interface INotification {
	
	/**
	 * The {@code Level} is applied to a {@link INotification} for specifying the impact
	 * of the message.
	 * 
	 * The order of importance is <i>growing</i> in order to be comparable by {@link #ordinal()}.
	 * 
	 * Anastasios Patrikis
	 */
	public enum Level {
		TRACE,
		DEBUG,
		INFO,
	}
	
	/**
	 * Get the {@link Level} assigned to this {@link INotification}.
	 * 
	 * @return the {@link Level} of this {@link INotification}.
	 */
	public Level getLevel();
	
	/**
	 * Get a {@link String} representation of the {@link INotification} object. 
	 * 
	 * @return a {@link String} representation of the {@link INotification} object.
	 */
	public String toString();
}
