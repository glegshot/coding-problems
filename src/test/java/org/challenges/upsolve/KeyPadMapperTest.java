package org.challenges.upsolve;

import org.challenges.upsolve.upsolve.KeyPadMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class KeyPadMapperTest {

    @Test
    public void testForKeyPadMatch() {
        KeyPadMapper keyPadMapper = new KeyPadMapper();
        List<String> results = keyPadMapper.getMatchList(2255, new ArrayList<String>(){{ add("call");add("ball"); add("basement"); add("elaborate");}});
        Assert.assertThat(results, hasItems("call","ball"));
        Assert.assertEquals(2,results.size());
    }


}
