package edu.lu.uni.serval.fixpattern;

import edu.lu.uni.serval.avatar.Patch;
import edu.lu.uni.serval.jdt.tree.ITree;
import java.util.List;

/**
 * FixTemplate interface.
 *
 * @author kui.liu
 *
 */
public interface IFixTemplate {

    public void setSuspiciousCodeStr(String suspiciousCodeStr);

    public String getSuspiciousCodeStr();

    public void setSuspiciousCodeTree(ITree suspiciousCodeTree);

    public ITree getSuspiciousCodeTree();

    public void generatePatches();

    public List<Patch> getPatches();

    public String getSubSuspiciouCodeStr(int startPos, int endPos);
}
