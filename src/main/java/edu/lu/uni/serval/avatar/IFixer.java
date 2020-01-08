package edu.lu.uni.serval.avatar;

import edu.lu.uni.serval.avatar.AbstractFixer.SuspCodeNode;
import edu.lu.uni.serval.utils.SuspiciousPosition;
import java.util.List;

/**
 * Fixer Interface.
 *
 * @author kui.liu
 *
 */
public interface IFixer {

    public List<SuspiciousPosition> readSuspiciousCodeFromFile();

    public SuspCodeNode parseSuspiciousCode(SuspiciousPosition suspiciousCode);

    public void fixProcess();

}
