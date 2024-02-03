package org.itsallcode.whiterabbit.plugin.storagebackend;

import org.itsallcode.whiterabbit.api.Plugin;
import org.itsallcode.whiterabbit.api.PluginConfiguration;
import org.itsallcode.whiterabbit.api.features.PluginFeature;

public class BackendStoragePlugin implements Plugin
{
    private PluginConfiguration config;
    private BackendMonthDataStorage storage;

    @Override
    public void init(PluginConfiguration config)
    {
        this.config = config;
    }

    @Override
    public String getId()
    {
        return "backend-storage";
    }

    @Override
    public void close()
    {
        if (storage != null)
        {
            storage.close();
        }
    }

    @Override
    public boolean supports(Class<? extends PluginFeature> featureType)
    {
        return featureType.isAssignableFrom(BackendMonthDataStorage.class);
    }

    @Override
    public <T extends PluginFeature> T getFeature(Class<T> featureType)
    {
        if (featureType.isAssignableFrom(BackendMonthDataStorage.class))
        {
            storage = new BackendMonthDataStorage(config);
            return featureType.cast(storage);
        }
        throw new IllegalArgumentException("Feature " + featureType.getName() + " not supported by plugin " + getId());
    }
}
