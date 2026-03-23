import { useState } from "react";
import { Form, Button, Card } from "react-bootstrap";
import axios from "axios";

export default function Signup({ setUser }) {
  const [form, setForm] = useState({ username: "", password: "" });

  const handleSignup = async () => {
    try {
      const res = await axios.post("http://localhost:8080/auth/signup", form);

      if (res.data.success) {
        setUser({ id: res.data.userId, username: form.username });
        alert("User created successfully");
      }
    } catch (err) {
      if (err.response && err.response.status === 409) {
        alert("User already exists");
      } else {
        console.error(err);
      }
    }
  };

  return (
    <Card>
      <Card.Body>
        <h4>Signup</h4>
        <Form>
          <Form.Control
            placeholder="Username"
            className="mb-2"
            onChange={(e) => setForm({ ...form, username: e.target.value })}
          />
          <Form.Control
            type="password"
            placeholder="Password"
            className="mb-2"
            onChange={(e) => setForm({ ...form, password: e.target.value })}
          />
          <Button variant="success" onClick={handleSignup}>
            Signup
          </Button>
        </Form>
      </Card.Body>
    </Card>
  );
}
