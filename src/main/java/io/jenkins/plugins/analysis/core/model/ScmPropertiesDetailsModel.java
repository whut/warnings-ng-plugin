package io.jenkins.plugins.analysis.core.model;

import java.util.ArrayList;
import java.util.List;

import edu.hm.hafner.analysis.Issue;
import edu.hm.hafner.analysis.Report;

import io.jenkins.plugins.analysis.core.model.StaticAnalysisLabelProvider.AgeBuilder;
import io.jenkins.plugins.analysis.core.scm.Blames;

/**
 * Provides the model for the source control details table. The model consists of the following parts:
 *
 * <ul>
 * <li>header name for each column</li>
 * <li>width for each column</li>
 * <li>content for each row</li>
 * <li>content for whole table</li>
 * </ul>
 *
 * @author Ullrich Hafner
 */
class ScmPropertiesDetailsModel extends DetailsTableModel {
    static final String UNDEFINED = "-";

    // FIXME: replace with Dipp Model
    private final Blames blames;

    ScmPropertiesDetailsModel(final AgeBuilder ageBuilder, final FileNameRenderer fileNameRenderer,
            final DescriptionProvider descriptionProvider, final Blames blames) {
        super(ageBuilder, fileNameRenderer, descriptionProvider);

        this.blames = blames;
    }

    @Override
    public List<Integer> getWidths(final Report report) {
        List<Integer> widths = new ArrayList<>();
        widths.add(1);
        widths.add(1);
        widths.add(1);
        widths.add(1);
        widths.add(1);
        widths.add(1);
        return widths;
    }

    @Override
    public List<String> getHeaders(final Report report) {
        List<String> visibleColumns = new ArrayList<>();
        visibleColumns.add(Messages.Table_Column_Details());
        visibleColumns.add(Messages.Table_Column_File());
        visibleColumns.add(Messages.Table_Column_Age());
        visibleColumns.add("#Committers");
        visibleColumns.add("#Changes");
        visibleColumns.add("#LastModified");
        return visibleColumns;
    }

    @Override
    protected List<String> getRow(final Report report, final Issue issue, final String description) {
        List<String> columns = new ArrayList<>();
        columns.add(formatDetails(issue, description));
        columns.add(formatFileName(issue));
        columns.add(formatAge(issue));
        // TODO: Add actual values for the specified issue
        columns.add(UNDEFINED);
        columns.add(UNDEFINED);
        columns.add(UNDEFINED);
        return columns;
    }
}
