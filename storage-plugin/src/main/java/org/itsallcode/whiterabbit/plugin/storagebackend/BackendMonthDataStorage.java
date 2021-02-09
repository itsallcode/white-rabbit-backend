package org.itsallcode.whiterabbit.plugin.storagebackend;

import static java.util.Collections.emptyList;

import java.time.YearMonth;
import java.util.List;
import java.util.Optional;

import org.itsallcode.whiterabbit.api.PluginConfiguration;
import org.itsallcode.whiterabbit.api.features.MonthDataStorage;
import org.itsallcode.whiterabbit.api.model.MonthData;
import org.itsallcode.whiterabbit.plugin.storagebackend.model.StorageModelFactory;

public class BackendMonthDataStorage implements MonthDataStorage
{
    private final PluginConfiguration config;

    public BackendMonthDataStorage(PluginConfiguration config)
    {
        this.config = config;
    }

    @Override
    public Optional<MonthData> load(YearMonth month)
    {
        return Optional.empty();
    }

    @Override
    public void store(YearMonth month, MonthData data)
    {

    }

    @Override
    public List<YearMonth> getAvailableDataMonths()
    {
        return emptyList();
    }

    @Override
    public List<MonthData> loadAll()
    {
        return emptyList();
    }

    @Override
    public ModelFactory getModelFactory()
    {
        return new StorageModelFactory();
    }

    public void close()
    {

    }
}