# ConfigUtilLogging

- Note: java.util.logging.FileHandler.pattern
A pattern consists of a string that includes the following special components that will be replaced at runtime:
        
        "/" the local pathname separator
        "%t" the system temporary directory
        "%h" the value of the "user.home" system property
        "%g" the generation number to distinguish rotated logs
        "%u" a unique number to resolve conflicts
        "%%" translates to a single percent sign "%" 