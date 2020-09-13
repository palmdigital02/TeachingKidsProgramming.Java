package src.main.java.org.teachingextentions.logo.utils.ApprovalUtils.reporters.macosx;

import java.text.MessageFormat;

import src.main.java.org.teachingextentions.logo.utils.ApprovalUtils.reporters.GenericDiffReporter;

public class BeyondCompareImageReporter extends 
    GenericDiffReporter
{
  public static final BeyondCompareImageReporter INSTANCE     = new BeyondCompareImageReporter();
  static final        String                     DIFF_PROGRAM = "/usr/local/bin/bcompare";
  static final        String                     MESSAGE      = MessageFormat.format(
      "Unable to find Beyond Compare at {0}",
      DIFF_PROGRAM);

  public BeyondCompareImageReporter() {
    super(DIFF_PROGRAM, STANDARD_ARGUMENTS, MESSAGE, IMAGE_FILE_EXTENSIONS);
  }
}
