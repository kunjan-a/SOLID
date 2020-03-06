package solid_2011.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator{
    public int allocate(IResourceManager resourceManager) {
        int resourceId = resourceManager.findFree();
        resourceManager.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(IResourceManager resourceManager,int resourceId) {
        resourceManager.markFree(resourceId);
    }

}
