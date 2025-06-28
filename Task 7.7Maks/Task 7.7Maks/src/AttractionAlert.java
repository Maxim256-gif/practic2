class AttractionAlert {
    private AttractionAlertSeverity severity;
    private String message;
    private int code;
    private String source;

    public AttractionAlert(AttractionAlertSeverity severity, String message, int code, String source) {
        this.severity = severity;
        this.message = message;
        this.code = code;
        this.source = source;
    }

    public AttractionAlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public String getSource() {
        return source;
    }
}