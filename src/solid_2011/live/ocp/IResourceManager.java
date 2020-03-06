package solid_2011.live.ocp;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/6/12
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IResourceManager {
    public void markSlotBusy(int resourceId);
    public void markFree(int resourceId);
    public int findFree();
}
