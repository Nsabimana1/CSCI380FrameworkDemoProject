package models;

public class Response {
    private int Response_id;
    private String Response_content;
    private int Responder_id;

    public Response(int r_id, String r_content, int responder_id){
        this.Response_id = r_id;
        this.Response_content = r_content;
        this.Responder_id = responder_id;
    }

    public int getResponse_id() {
        return Response_id;
    }

    public String getResponse_content(){
        return Response_content;
    }

    public int getResponder_id(){
        return this.Responder_id;
    }
}

