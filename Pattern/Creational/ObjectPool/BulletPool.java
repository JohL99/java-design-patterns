package Pattern.Creational.ObjectPool;

import java.util.ArrayList;

/**
 * This is the ObjectPool portion of the ObjectPool design pattern.
 * This class is responsible for creating and managing the Bullet objects.
 */
public class BulletPool {
    // Private Members

    // The singleton instance of the BulletPool
    private static BulletPool instance = null;
    // The list of bullets in the pool
    private ArrayList<Bullet> bullets;

    /**
     * Private constructor for the BulletPool class.
     */
    private BulletPool() {
        this.bullets = new ArrayList<Bullet>();
    };

    /**
     * This method is used to retrieve the singleton instance of the {@code BulletPool}.
     * @return The singleton instance of the {@code BulletPool}.
     */
    public static BulletPool getInstance() {
        if (instance == null) {
            instance = new BulletPool();
        }
        return instance;
    };

    /**
     * This method is used to retrieve a {@link Bullet} from the pool.
     * @return A {@code bullet} from the pool.
     */
    public Bullet getBullet() {
        if (this.bullets.size() > 0) {
            return this.bullets.remove(0);
        } else {
            return new Bullet();
        }
    }

    /**
     * This method is used to return a {@link Bullet} to the pool.
     * @param bullet the {@code bullet} to return to the pool.
     */
    public void returnBullet(Bullet bullet) {
        if (bullet != null) {
            this.bullets.add(bullet);
        }
    }


}
