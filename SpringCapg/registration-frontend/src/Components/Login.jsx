import { useState } from "react";
import { Form, Button, Card } from "react-bootstrap";
import axios from "axios";

export default function Login({ setUser }) {
  const [form, setForm] = useState({ username: "", password: "" });

const handleLogin = async () => {
  try {
    const res = await axios.post("http://localhost:8080/auth/login", form);

    if (res.data.success) {
      setUser({ username: res.data.username });
    }

  } catch (err) {
    if (err.response && err.response.status === 401) {
      alert("Invalid credentials");
    } else {
      console.error(err);
    }
  }
};

  return (
    <Card>
      <Card.Body>
        <h4>Login</h4>
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
          <Button onClick={handleLogin}>Login</Button>
        </Form>
      </Card.Body>
    </Card>
  );
}
