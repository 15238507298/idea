package ac.background.action;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.ByteArrayOutputStream;


@Controller

public class ac_action_validatePicture {
    @RequestMapping("front/getvalidateImage/")
    public ResponseEntity<byte[]> getByteValidate() {
        validateNum val = new validateNum();
        ByteArrayOutputStream by = val.drawImage(val.productStrings());
        HttpHeaders ha = new HttpHeaders();
        ha.setContentType(MediaType.IMAGE_PNG);

        return new ResponseEntity<>(by.toByteArray(), ha, HttpStatus.OK);
    }

}
