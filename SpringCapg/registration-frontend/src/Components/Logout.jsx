import { Button } from "react-bootstrap";

export default function Logout({ setUser }) {
  return (
    <Button
      variant="secondary"
      className="mt-3"
      onClick={() => setUser(null)}
    >
      Logout
    </Button>
  );
}