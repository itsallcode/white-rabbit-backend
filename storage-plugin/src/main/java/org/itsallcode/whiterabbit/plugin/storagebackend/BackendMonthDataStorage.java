package org.itsallcode.whiterabbit.plugin.storagebackend;

import static java.util.Collections.emptyList;

import java.time.YearMonth;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.itsallcode.whiterabbit.api.PluginConfiguration;
import org.itsallcode.whiterabbit.api.features.MonthDataStorage;
import org.itsallcode.whiterabbit.api.model.MonthData;
import org.itsallcode.whiterabbit.plugin.storagebackend.model.StorageModelFactory;

public class BackendMonthDataStorage implements MonthDataStorage
{
    private static final Logger LOG = LogManager.getLogger(BackendMonthDataStorage.class);
    private final PluginConfiguration config;

    public BackendMonthDataStorage(PluginConfiguration config)
    {
        this.config = config;
    }

    @Override
    public Optional<MonthData> load(YearMonth month)
    {
        LOG.info("Load month {}", month);
        return Optional.empty();
    }

    @Override
    public void store(YearMonth month, MonthData data)
    {
        LOG.info("Store month {}", month);
    }

    @Override
    public List<YearMonth> getAvailableDataMonths()
    {
        LOG.info("Get available months");
        return emptyList();
    }

    @Override
    public List<MonthData> loadAll()
    {
        LOG.info("Load all data");
        return emptyList();
    }

    @Override
    public ModelFactory getModelFactory()
    {
        return new StorageModelFactory();
    }

    public void close()
    {
        LOG.info("Close storage");
    }
}